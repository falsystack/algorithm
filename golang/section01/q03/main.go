package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

/**
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

Input
it is time to study

Output
study

*/

func main() {
	reader := bufio.NewReader(os.Stdin)
	line, _ := reader.ReadString('\n')
	splitedStr := strings.Split(line, " ")

	result := 0
	for _, str := range splitedStr {
		if len(str) > result {
			result = len(str)
		}
	}
	fmt.Println(result)
}
