import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class JavaStreamAPI {
	static void print(Object o) {
			System.out.println(o);
	}
	
	static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray()) {
			result.add(c);
		}
		return result.stream();
	}
		
	public static void main(String[] args) {
		// reduce
//		IntStream i = IntStream.of(1, 2, 3, 4, 5);
//		int prodI = i.reduce(1, (x, y) -> x * y);
//		System.out.println(prodI);

		// Stream.of
	    Stream strs = Stream.of("Hello", "World");
//		strs.forEach(str -> System.out.println(str));
//		strs.forEach(System.out::println);
		
		// Stream.generate
//		Stream<String> echoes = Stream.generate(() -> {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();	
//			}
//			return "carl";
//		});
//		echoes.forEach(str -> System.out.println(str));
		
		// Stream.iterate 迭代
//		Stream ints = Stream.iterate(2, n -> n+1);
//		ints.forEach(System.out::println);
		
		// Stream.limit 
//		Stream ints = Stream.iterate(2, n -> n+1).limit(100); // 相当于到了100就把水龙头关了，then结束了。
		
		// Stream.skip
//		Stream ints = Stream.iterate(2, n -> n + 1).limit(100).skip(90);
		
		// Stream.concat
//		Stream stream1 = Stream.iterate(2, n -> n + 1).limit(10);
//		Stream stream2 = Stream.iterate(9000, n -> n + 1).limit(10);	
//		Stream ints = Stream.concat(stream1, stream2);
//		ints.forEach(System.out::println);
		
	    
		// characterStream
//		Stream<Character> chars = Stream.concat(characterStream("Hello"), characterStream("world"));
//		chars.forEach(System.out::println);
		
		// Stream.map vs Stream.flatMap
//		List<String> list = Arrays.asList("Joe", "Carl");
//		Stream<Stream<Character>> mapResult = list.stream().map(s -> characterStream(s));
//		Stream<Character> flatMapResult = list.stream().flatMap(s -> characterStream(s));		
//		mapResult.forEach(stream -> stream.forEach(System.out::println));
//		flatMapResult.forEach(System.out::println);		
		
		// Stream.sorted
		Stream<String> stream = Stream.of("Z", "Tom", "Carl", "Richard");
		// method #1:
//		Stream<String> sorted = stream.sorted();
		// method #2:
//		Stream<String> sorted = stream.sorted((x, y) -> y.length()-x.length());
		// method #3:
//		Stream<String> sorted = stream.sorted(Comparator.comparing(String::length).reversed());
		// method #4: compare with method #3
		Function<String, Integer> byLength = x -> { return x.length(); };
		Stream<String> sorted = stream.sorted(Comparator.comparing(byLength).reversed());
		sorted.forEach(System.out::println);
		
		
		
	}
	
}





