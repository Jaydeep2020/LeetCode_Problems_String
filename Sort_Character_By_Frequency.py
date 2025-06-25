def frequency_sort(s):
    
    freq = {}
    
    for ch in s:
        if ch in freq:
            freq[ch] += 1
        else:
            freq[ch] = 1
            
    sorted_freq = sorted(freq.items(), key = lambda item : item[1], reverse = True)
    
    result = ''
    
    for char, count in sorted_freq:
        result += char * count
    
    return result
    
s = 'tree'
result = frequency_sort(s)
print(result)


Output:

eetr

=== Code Execution Successful ===
