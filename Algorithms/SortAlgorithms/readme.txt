BUBBLE SORT is not the fastest sort algorithm but is commonly implemented when learning algorithms.
Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
comparing each pair of adjacent items and swapping them if they are in the wrong order.
The pass through the list is repeated until no swaps are needed, which indicates
that the list is sorted. 
Experiments by Astrachan sorting strings in Java show bubble sort to be 
roughly 5 times slower than insertion sort and 40% slower than selection sort.

Files with bubble sort implementation: BubbleSortWith2Loops.java and BubbleSortWithLoopAndDoWhile.java
More info: http://en.wikipedia.org/wiki/Bubble_sort
--------------------------------------
INSERT SORT it is much less efficient on large lists than more advanced algorithms such as quicksort,
heapsort, or merge sort.
Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
On a repetition, insertion sort removes one element from the input data, finds the location it belongs 
within the sorted list, and inserts it there. It repeats until no input elements remain.

File with Insert Sort implementation: InsertSort.java
More info: http://en.wikipedia.org/wiki/Insertion_sort
--------------------------------------
SELECTION SORT is inefficient on large lists, and generally performs worse than the similar insertion sort.
Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms
in certain situations, particularly where auxiliary memory is limited.

File with Select Sort implementation: SelectionSort.java
More info: http://en.wikipedia.org/wiki/Selection_sort
--------------------------------------
MERGE SORT produce a stable sort, which means that the implementation preserves the input order of equal elements
in the sorted output. It`s powerfull but it has a dificult implementation.
I take the implementation from internet!

File with Merge Sort implementation: MergeSort.java
More info: http://en.wikipedia.org/wiki/Merge_sort

