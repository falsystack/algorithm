package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
	"unicode"
)

/*
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

Input
StuDY

Output
sTUdy

*/

func main() {
	reader := bufio.NewReader(os.Stdin)
	line, _ := reader.ReadString('\n')
	runes := []rune(strings.TrimSpace(line))

	result := ""
	for i := range runes {
		if unicode.IsLower(runes[i]) {
			result += string(unicode.ToUpper(runes[i]))
			continue
		}
		result += string(unicode.ToLower(runes[i]))
	}
	fmt.Println(result)
}
