class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        dic = {}

        start=0
        end=0
        length=0

        while end<len(fruits):
            if fruits[end] in dic:
                dic[fruits[end]]+=1
            else:
                dic[fruits[end]]=1

            if len(dic)>2:
                dic[fruits[start]]-=1
                if dic[fruits[start]]==0:
                    del dic[fruits[start]]
                start+=1

            length=max(length,end-start+1) 
            end+=1

        return length