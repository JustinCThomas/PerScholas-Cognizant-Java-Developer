const leftArrows = document.getElementsByClassName("left-arrow");
const rightArrows = document.getElementsByClassName("right-arrow");

const restaurantArrows = [leftArrows[0], rightArrows[0]];
const foodArrows = [leftArrows[1], rightArrows[1]];
const drinksArrows = [leftArrows[2], rightArrows[2]];
const comboArrows = [leftArrows[3], rightArrows[3]];

let restaurants = document.getElementsByClassName("restaurant");
let foodItems = document.getElementsByClassName("food-img-container");
let beverages = document.getElementsByClassName("beverages-img-container");

addEvents(restaurantArrows, restaurants, "restaurantCount");
addEvents(foodArrows, foodItems, "foodCount");
addEvents(drinksArrows, beverages, "beverageCount");

setFourOptions(restaurants);
setFourOptions(foodItems);
setFourOptions(beverages);


function setFourOptions (optionType) {
	for (let i = 0; i < optionType.length; i++){
		if (i > 3){
			optionType[i].style.display = "none";
		}
	}
}

let countHolder = {
	foodCount: 0,
	beverageCount: 0,
	restaurantCount: 0
};

function addEvents(arrowSet, itemCategorySet, countName){
	if (itemCategorySet.length >= 4) {
		arrowSet[0].addEventListener("click", () => {
			console.log("clicked");
			countHolder[countName] -= 1;
			countHolder[countName] = checkCount(countHolder[countName], itemCategorySet);
			displayFoodItems(countHolder[countName], itemCategorySet);
		});

		arrowSet[1].addEventListener("click", () => {
			console.log("clicked right button");
			countHolder[countName] += 1;
			countHolder[countName] = checkCount(countHolder[countName], itemCategorySet);
			displayFoodItems(countHolder[countName], itemCategorySet);
		});
	}
}


function displayFoodItems(count, itemCategorySet){
	for (let i = 0; i < itemCategorySet.length; i++){
		itemCategorySet[i].style.display = "none";
		itemCategorySet[i].style.order = 100;
	}

	let order = 1;

	if (count >= 0) {
		for (let i = count; i <= count + 3	; i++){
			if (i <= itemCategorySet.length - 1) {
				itemCategorySet[i].style.display = "inline-block";
				itemCategorySet[i].style.order = order;	
			} else {
				itemCategorySet[0 + (i - itemCategorySet.length)].style.display = "inline-block";
				itemCategorySet[0 + (i - itemCategorySet.length)].style.order = order;	
			}
			order++;
		}
	} else if (count < 0) {
		for (let i = count; i <= count + 3; i++){
			if (i < 0) {
				itemCategorySet[itemCategorySet.length + i].style.display = "inline-block";
				itemCategorySet[itemCategorySet.length + i].style.order = order;	
			} else {
				itemCategorySet[i].style.display = "inline-block";
				itemCategorySet[i].style.order = order;	
			}
			order++;
		}
	}
}

function checkCount(count, itemCategorySet){
	if (count > itemCategorySet.length - 1) {
		return 0;
	} else if (count < 1 - itemCategorySet.length) {
		return 0;
	} else {
		return count;
	}
}
