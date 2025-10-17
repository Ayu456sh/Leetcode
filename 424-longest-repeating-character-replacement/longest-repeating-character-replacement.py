class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        dic={}
        n=len(s)
        start=0
        length=0
        maxFreq=0

        for i in range(n):
            ch = s[i]
            if ch not in dic:
                dic[ch]=1
            else:
                dic[ch]+=1
            maxFreq=max(maxFreq,dic[ch])

            if (i-start+1)-maxFreq>k:
                dic[s[start]]=dic[s[start]]-1
                start+=1
            length=max(length,i-start+1)
        return length