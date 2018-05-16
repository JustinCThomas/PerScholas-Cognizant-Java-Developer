const leftArrows = document.getElementsByClassName("left-arrow");
const rightArrows = document.getElementsByClassName("right-arrow");

const restaurantArrows = [leftArrows[0], rightArrows[0]];
const foodArrows = [leftArrows[1], rightArrows[1]];
const drinksArrows = [leftArrows[2], rightArrows[2]];
const comboArrows = [leftArrows[3], rightArrows[3]];

let foodItems = document.getElementsByClassName("food-img-container");

for (let i = 0; i < foodItems.length; i++){
	if (i > 3){
		foodItems[i].style.display = "none";
	}
}

let currentCount = 0;


for (let i = 0; i < leftArrows.length; i++){
	leftArrows[i].addEventListener("click", () => {
		console.log("clicked");
		currentCount -= 1;
		currentCount = checkCount(currentCount);
		displayFoodItems(currentCount);
	});
}

for (let i = 0; i < rightArrows.length; i++){
	rightArrows[i].addEventListener("click", () => {
		console.log("clicked right button");
		currentCount += 1;
		currentCount = checkCount(currentCount);
		displayFoodItems(currentCount);
	});
}

function displayFoodItems(count){
	for (let i = 0; i < foodItems.length; i++){
		foodItems[i].style.display = "none";
		foodItems[i].style.order = 100;
	}

	let order = 1;

	if (count > foodItems.length - 1){
		count = 0;
	}

	for (let i = count; i <= count + 3; i++){
		if (i <= foodItems.length - 1) {
			foodItems[i].style.display = "inline-block";
			foodItems[i].style.order = order;	
		} else {
			foodItems[0 + (i - foodItems.length)].style.display = "inline-block";
			foodItems[0 + (i - foodItems.length)].style.order = order;	
		}
		
		order++;
	}
}

function checkCount(count){
	if (count > foodItems.length - 1) {
		return 0;
	} else if (count < 0) {
		return foodItems.length - 3;
	} else {
		return count;
	}
}

// let arr = [6, 1, 2, 3];
// let foodWrapper = document.getElementById("food");
// let items = foodWrapper.children;
// let elements = document.createDocumentFragment();

// arr.forEach(function(idx) {
// 	elements.appendChild(items[idx].cloneNode(true));
// });

// foodWrapper.innerHTML = null;
// foodWrapper.appendChild(elements);

