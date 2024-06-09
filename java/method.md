# Method

## String
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


## Math
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
- 절대값 - `Math.abs()`
```java
System.out.println(Math.abs(-2));
```
```
2
```

## Arrays
- 배열을 리스트로 변환 - `Arrays.asList()`
```java
String[] arr = {"A", "B", "C"};
List<String> list = Arrays.asList(arr);
System.out.println(list);
```
```
[A, B, C]
```
- 배열값 출력 - `Arrays.toString()`
```java
String[] arr = {"A", "B", "C"};
System.out.println(Arrays.toString(arr));
```
```
[A, B, C]
```

## List
- 리스트를 배열로 변환 - `toArray()`
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
String[] arr = list.toArray(new String[list.size()]);
System.out.println(Arrays.toString(arr));
```
```
[A, B, C]
```
