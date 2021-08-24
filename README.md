# Binary Search
<h3>Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].<br></h3>
A simple approach is to do a linear search. The time complexity of the above algorithm is O(n). 
Another approach to perform the same task is using Binary Search.<br><br>
<strong><i>Binary Search</i></strong>:<p style="font-size:79px"> Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. <br>
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. <br>
Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.</p>

Input:

```python
arr[] = { 2, 3, 4, 10, 40 }
ValueToFind = 10
```

Output:

```python
Index = 3
```
