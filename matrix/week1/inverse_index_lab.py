from random import randint
from dictutil import *

## Task 1
def movie_review(name):
    """
    Input: the name of a movie
    Output: a string (one of the review options), selected at random using randint
    """
    review_options = ["See it!", "A gem!", "Ideological claptrap!"]
    return  review_options[randint(0,2)]

## Tasks 2 and 3 are in dictutil.py

## Task 4    
def makeInverseIndex(strlist):
    """
    Input: a list of documents as strings
    Output: a dictionary that maps each word in any document to the set consisting of the
            document ids (ie, the index in the strlist) for all documents containing the word.

    Note that to test your function, you are welcome to use the files stories_small.txt
      or stories_big.txt included in the download.
    """
    map = {}
    for (i,s) in enumerate(strlist):
        for word in s.split():
            map[word]=map[word] |{i} if word in map else {i}
    return map

## Task 5
def orSearch(inverseIndex, query):
    """
    Input: an inverse index, as created by makeInverseIndex, and a list of words to query
    Output: the set of document ids that contain _any_ of the specified words
    """
    result = set()
    for word in query:
        for (index,doc) in inverseIndex.items():
            if index == word:
                result.update(doc)
    return result

## Task 6
def andSearch(inverseIndex, query):
    """
    Input: an inverse index, as created by makeInverseIndex, and a list of words to query
    Output: the set of all document ids that contain _all_ of the specified words
    """
   
    tmpResult = []
    result=set()
    
    for word in query:
        temp = inverseIndex[word] if word in inverseIndex else set()
       # print(word)
       # print(temp)
        tmpResult=tmpResult+[temp]
    if len(tmpResult)==0:
        result=set()
    else:
        result=tmpResult[0]
       # print(tmpResult)
       # print(result)
        for t in tmpResult:
            result.intersection_update(t)
        
    return result 
