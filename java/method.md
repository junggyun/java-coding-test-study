# Method

## String

<details>
<summary>접기/펼치기</summary>
  
<br>

- 접두사 - `startsWith()`
```java
String str = "Hello";
System.out.println(str.startsWith("Hel"));
```
```
true
```
- 접미사 - `endsWith()`
```java
String str = "Hello";
System.out.println(str.endsWith("llo"));
```
```
true
```
- 문자에 따라 - `toCharArray()`
```java
String str = "Hello";
char[] arr = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o'}
```
- 문자열로 변환 - `String.valueOf()`
```java
int a = 1;
int b = 2;
System.out.println(String.valueOf(a) + String.valueOf(b));
```
```
12
```
- 같은 문자열 반복 - `repeat()`
```java
String str = "Hello";
System.out.println(str.repeat(3));
```
```
HelloHelloHello
```
- 특정 문자열 포함 - `contains()`
```java
System.out.println("Hello".contains("el"));
```
```
true
```
- 문자열을 문자열 배열로 쪼개기 - `split()`
```java
String str = "12345";
System.out.println(Arrays.toString(str.split("")));
```
```
[1, 2, 3, 4, 5]
```
- 사전순으로 비교 - `compareTo()` - 음수가 빠름
```java
String str1 = "AB";
String str2 = "BA";
System.out.println(str1.compareTo(str2));
```
```
-1
```
</details>



## Math

<details>
<summary>접기/펼치기</summary>

<br>

- 큰 값 - `Math.max()`
```java
System.out.println(Math.max(10, 5));
```
```
10
```
- 작은 값 - `Math.min()`
```java
System.out.println(Math.min(10, 5));
```
```
5
```
- 제곱 - `Math.pow()`
```java
System.out.println(Math.pow(10, 2));
```
```
100.0
```
- 제곱근 - `Math.sqrt()`
```java
System.out.println(Math.sqrt(100));
```
```
10.0
```
- 절대값 - `Math.abs()`
```java
System.out.println(Math.abs(-2));
```
```
2
```
</details>


## Arrays

<details>
<summary>접기/펼치기</summary>

<br>

- 배열을 리스트로 변환(String) - `Arrays.asList()`
```java
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.asList(arr);
System.out.println(list);
```
```
[A, B, C]
```
- 배열을 리스트로 변환(int) - `Arrays.asList()`
```java
int[] numbers = {1, 2, 3, 4, 5};
List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
System.out.println(list.toString());
```
```
[1, 2, 3, 4, 5]
```
- 배열값 출력 - `Arrays.toString()`
```java
String[] arr = {"A", "B", "C"};
System.out.println(Arrays.toString(arr));
```
```
[A, B, C]
```
- 2차원, 다차원 배열값 출력 `Arrays.deepToString()`
```java
int[][] arr = {{2, 3}, {1, 4}};
System.out.println(Arrays.deepToString(arr));
```
```
[[2, 3], [1, 4]]
```
- 원시타입을 참조타입으로 변환 `Arrays.stream().boxed().toArray()`
```java
int[] arr1 = {1, 3, 5, 2, 4};
Integer[] arr2 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
```
- 오름차순 정렬 - `Arrays.sort()`
```java
int[] arr = {1, 3, 5, 2, 4};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
```
```
[1, 2, 3, 4, 5]
```
- 오름차순 정렬(2차원) - `Arrays.sort()` - 람다
```java
int[][] arr = {{2, 3}, {1, 4}};
Arrays.sort(arr, (o1, o2) -> {
    return o1[0] - o2[0];
});
System.out.println(Arrays.deepToString(arr));
```
```
[[1, 4], [2, 3]]
```
- 내림차순 정렬 - `Arrays.sort()` - 래퍼클래스만 가능
```java
Integer[] arr = {1, 3, 5, 2, 4};
Arrays.sort(arr, Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
```
```
[5, 4, 3, 2, 1]
```
- 내림차순 정렬(2차원) - `Arrays.sort()` - 람다
```java
int[][] arr = {{1, 4}, {2, 3}};
Arrays.sort(arr, (o1, o2) -> {
    return o2[0] - o1[0];
});
System.out.println(Arrays.deepToString(arr));
```
```
[[2, 3], [1, 4]]
```
</details>

## List

<details>
<summary>접기/펼치기</summary>

<br>

- 리스트를 배열로 변환 - `toArray()`
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
String[] arr = list.toArray(new String[list.size()]);
System.out.println(Arrays.toString(arr));
```
```
[A, B, C]
```
</details>

## StringBuilder

<details>
<summary>접기/펼치기</summary>

<br>

- 문자열 뒤집기 - `reverse()`
```java
StringBuilder sb = new StringBuilder("12345");
sb.reverse();
System.out.println(sb.toString());
```
```
54321
```
</details>

## Set

<details>
<summary>접기/펼치기</summary>

<br>

- 데이터 포함 여부 - `contains()`
```java
Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
System.out.println(set.contains(2));
```
```
true
```
</details>
