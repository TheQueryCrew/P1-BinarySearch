// Binary Search recursive function
const binarySearch = function (array, value) {
  // Set pointer to middle index
  let ptr = Math.floor(array.length / 2);

  // if searched value is equal to value at middle index return the index;
  if (array[ptr] === value) return arr.indexOf(array[ptr]);

  //If array length reaches to 1 and its not equal to searched value, return -1
  if (array.length === 1) return -1;

  // if value is lower/greater than the value at middle, trim all the values that are greater/lower from the array
  array = value < array[ptr] ? array.slice(0, ptr) : array.slice(ptr);

  // recursively call the binarySearch function with the trimmed array
  return binarySearch(array, value);
};

// Test Data
let arr = [2, 3, 4, 10, 40];
let ValueToFind = 10;

// Result
let index = binarySearch(arr, ValueToFind);
index === -1
  ? console.log('Element not found')
  : console.log(`Index = ${index}`);
