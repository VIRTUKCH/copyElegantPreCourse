/*
 * Model과 MVC패턴
 * 1. Model은 Controller와 View에 의존해서는 안된다. - import 금지
 * 2. View는 Model에만 의존해야 하며, Controller에는 의존하면 안된다.
 * 3. View가 Model로부터 데이터를 받을 때에는, 사용자마다 다르게 보여주어야 하는 데이터만 받아야 한다.
 * 4. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.
 */
package followPreCourse.Week1.Model;

public class Computer {
	private int numberOfComputer;
	public Computer() {
		while(!isNumberValid()) {
			this.numberOfComputer = (int) (Math.random() * 899) + 101;
		}
	}
	
	private boolean isNumberValid() {
		int hundred = this.numberOfComputer / 100;
		int ten = (this.numberOfComputer / 10) % 10;
		int one = this.numberOfComputer % 10;
		
		return (hundred == ten || hundred == one || ten == one) ? false : true;
//		return !(hundred == ten || hundred == one || ten == one); // 한눈에 들어오는 코드가 더 중요할까
	}
}

// 1. 메서드 이름 변경 isNumberSuitable() -> isNumberValid
// 2. 메서드 매개변수 삭제 isNumberValid(this.numberOfComputer)
// 3. Computer 클래스의 생성자 