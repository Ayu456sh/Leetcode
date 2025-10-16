class Solution:
    def reverse(self, x: int) -> int:
        
        num=abs(x)
        rev=0
        
        while num!=0:
            digit=num%10

            if rev>(2**31 -1)//10:
                return 0
            rev = rev*10+digit
            num=num//10
        
        if x<0:
            return -rev
        else:
            return rev
            