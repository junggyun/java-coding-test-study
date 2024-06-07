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
- 문자열로 변환 - `valueOf()`
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

## Math
- 큰 값 - `max()`
```java
System.out.println(Math.max(10, 5));
```
```
10
```
- 작은 값 - `min()`
```java
System.out.println(Math.min(10, 5));
```
```
5
```
- 제곱 - `pow()`
```java
System.out.println(Math.pow(10, 2));
```
```
100.0
```
