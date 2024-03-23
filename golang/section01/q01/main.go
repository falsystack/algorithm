package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
	"unicode"
)

/*
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

Input
Computercooler
c

Output
2
*/
func main() {
	reader := bufio.NewReader(os.Stdin)

	inputText, _ := reader.ReadString('\n')
	inputText = strings.TrimSpace(inputText)
	inputText = strings.ToLower(inputText)

	target, _, _ := reader.ReadRune()
	target = unicode.ToLower(target)

	count := countOccurrences(inputText, target)
	fmt.Println(count)
}

func countOccurrences(inputText string, target rune) int {
	words := []rune(inputText)
	count := 0
	for i := 0; i < len(words); i++ {
		if words[i] == target {
			count++
		}
	}
	return count
}
