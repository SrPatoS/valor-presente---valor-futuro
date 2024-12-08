def app01(t, v, j):
    #01
    #VFn = VP * (1 + i)n

    sum = v * (1+j)**t

    print(sum)

def app02(t, v, j):
    #02
    #VP = VFn * [1 / (1+i)n]

    sum = v / (1 + j)**t

    print(sum)


#01
app01(10, 1200, 0.09)
app01(8, 2000, 0.1)

#02
app02(10, 12000, 0.08)
app02(12, 14000, 0.08)