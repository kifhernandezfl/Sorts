def insertionSort(unsorted):
    for i in range(1,len(unsorted)):
        temp = unsorted[i]
        indexHole = i
        
        while indexHole > 0 and unsorted[indexHole - 1] > temp:
            unsorted[indexHole] = unsorted[indexHole - 1]
            indexHole -= 1
            
        unsorted[indexHole] = temp    
     
unsorted = [54,26,93,17,77,31,44,55,20]
print(unsorted)

