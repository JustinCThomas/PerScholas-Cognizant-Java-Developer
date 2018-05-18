const leftArrows = document.getElementsByClassName("left-arrow");
const rightArrows = document.getElementsByClassName("right-arrow");

const restaurantArrows = [leftArrows[0], rightArrows[0]];
const foodArrows = [leftArrows[1], rightArrows[1]];
const drinksArrows = [leftArrows[2], rightArrows[2]];
// const comboArrows = [leftArrows[3], rightArrows[3]];

let restaurants = document.getElementsByClassName("restaurant");
let foodItems = document.getElementsByClassName("food-img-container");
let beverages = document.getElementsByClassName("beverages-img-container");


let mcDonalds = [[], []];
let burgerKing = [[], []];

for (let i = 0; i < foodItems.length; i++){
	if (foodItems[i].classList.contains("mcdonalds")){
		mcDonalds[0] = foodItems[i];	
	} else if (foodItems[i].classList.contains("burger-king")){
		burgerKing[0] = foodItems[i];	
	}
}

for (let i = 0; i < beverages.length; i++){
	if (beverages[i].classList.contains("mcdonalds")){
		mcDonalds[1] = beverages[i];	
	} else if (beverages[i].classList.contains("burger-king")){
		burgerKing[1] = beverages[i];	
	}
}


addEvents(restaurantArrows, restaurants, "restaurantCount");


addEvents(foodArrows, mcDonalds[0], "foodCount");
addEvents(drinksArrows, mcDonalds[1], "beverageCount");

addEvents(foodArrows, burgerKing[0], "foodCount");
addEvents(drinksArrows, burgerKing[1], "beverageCount");

selectRestaurant();

let countHolder = {
	foodCount: 0,
	beverageCount: 0,
	restaurantCount: 0
};

restaurants[0].click();


function selectRestaurant() {
	for (let i = 0; i < restaurants.length; i++){
		restaurants[i].addEventListener("click", function() {
			if (!this.classList.contains("selected")){
				for (let i = 0; i < restaurants.length; i++) {
					restaurants[i].classList.remove("selected");	
				}
				this.classList.add("selected");
				showRestaurantOptions(this);
			}
		});
	}
}

function showRestaurantOptions(clickedElement) {
	// show McDonalds
	if (clickedElement.classList.contains("mcdonalds")){
		let order = 1;
		for (let i = 0; i < foodItems.length; i++){
			if (foodItems[i].classList.contains("mcdonalds")){
				foodItems[i].style.display = "inline-block";
				foodItems[i].style.order = order;
				order++;
			} else {
				foodItems[i].style.display = "none";
				foodItems[i].style.order = 100;
			}
		}

		order = 1;

		for (let i = 0; i < beverages.length; i++){
			if (beverages[i].classList.contains("mcdonalds")){
				beverages[i].style.display = "inline-block";
				beverages[i].style.order = order;
				order++;
			} else {
				beverages[i].style.display = "none";
				beverages[i].style.order = 100;
			}
		}
		// show Burger King
	} else if (clickedElement.classList.contains("burger-king")){
		let order = 1;
		for (let i = 0; i < foodItems.length; i++){
			if (foodItems[i].classList.contains("burger-king")){
				foodItems[i].style.display = "inline-block";
				foodItems[i].style.order = order;
			} else {
				foodItems[i].style.display = "none";
				foodItems[i].style.order = 100;
			}
		}
		order = 1;
		
		
		for (let i = 0; i < beverages.length; i++){
			if (beverages[i].classList.contains("burger-king")){
				beverages[i].style.display = "inline-block";
				beverages[i].style.order = order;
				order++;
			} else {
				beverages[i].style.display = "none";
				beverages[i].style.order = 100;
			}
		}
	}
	countHolder.foodCount = 0;
	countHolder.beverageCount = 0;
	countHolder.restaurantCount = 0;
}

function addEvents(arrowSet, itemCategorySet, countName){
	if (itemCategorySet.length >= 4) {
		arrowSet[0].addEventListener("click", () => {
			console.log("clicked");
			countHolder[countName] -= 1;
			countHolder[countName] = checkCount(countHolder[countName], itemCategorySet);
			displayItems(countHolder[countName], itemCategorySet);
		});

		arrowSet[1].addEventListener("click", () => {
			console.log("clicked right button");
			countHolder[countName] += 1;
			countHolder[countName] = checkCount(countHolder[countName], itemCategorySet);
			displayItems(countHolder[countName], itemCategorySet);
		});
	}
}


function displayItems(count, itemCategorySet){
	for (let i = 0; i < itemCategorySet.length; i++){
		itemCategorySet[i].style.display = "none";
		itemCategorySet[i].style.order = 100;
	}

	let order = 1;

	if (count >= 0) {
		for (let i = count; i <= count + 3; i++){
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
