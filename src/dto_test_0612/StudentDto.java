package dto_test_0612;

//학사 관리 프로그램에서 학생정보를 저장하는 용도의 클래스
public class StudentDto {
    String hakbun; //변수 (학번) 이렇게 변수를 정의하는 것을 필드라고 부름

    /* main 함수안에 있는 변수 -> 지역변수 -> 자동초기화가 안됨.
    *  하지만 field 는 자동으로 기본값으로 초기화 됨
    * 필드는 클래스로부터 객체가 생성된 후에 사용 가능함 */
    String name;
    String major;

}