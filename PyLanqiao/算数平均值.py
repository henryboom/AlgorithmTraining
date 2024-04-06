import statistics
list = [1,2,3]
print(statistics.mean(list))
print(statistics.median(list))#计算数据的中位数，如果有两个中位数，则返回其平均值
print(statistics.median_low(list)) #数据中的低中位数
print(statistics.median_high(list))#数据中的高中位数
print(statistics.mode(list)) #计算众数
print(statistics.pvariance(list))#计算数据的总体方差
