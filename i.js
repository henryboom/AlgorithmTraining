function findMostFrequentChar(str) {
    // 创建一个对象来保存每个字符的出现次数
    let charCount = {};

    // 遍历字符串，统计每个字符的出现次数
    for (let char of str) {
        if (charCount[char]) {
            charCount[char]++;
        } else {
            charCount[char] = 1;
        }
    }

    // 初始化最大次数和对应的字符
    let maxCount = 0;
    let maxChar = '';

    // 遍历统计结果，找到出现次数最多的字符
    for (let char in charCount) {
        if (charCount[char] > maxCount) {
            maxCount = charCount[char];
            maxChar = char;
        }
    }

    // 返回出现次数最多的字符
    return { character: maxChar, count: maxCount };
}

// 测试
let str = "javascript";
let result = findMostFrequentChar(str);
console.log(`The most frequent character is '${result.character}' with ${result.count} occurrences.`);
