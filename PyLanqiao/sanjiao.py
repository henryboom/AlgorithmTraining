#杨辉三角
def output(n):
    if n==1:
        return 1
    else:
        sanjiao=[]
        for i in range(n):
            sanjiao.append([1 for _ in range(i+1)])
            if i>=2:
                for j in range(1,i):
                    sanjiao[i][j]=sanjiao[i-1][j-1]+sanjiao[i-1][j]
                    if sanjiao[i][j] == n:
                        result=(1+i)*i/2+j+1
                        print(sanjiao)
                        return result   
N=int (input())
print(int (output(N)))
            
