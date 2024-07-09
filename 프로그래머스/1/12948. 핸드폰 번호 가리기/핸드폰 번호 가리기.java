class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String last ="";
        last = phone_number.substring(phone_number.length()-4);
        phone_number = phone_number.replaceAll("[0-9]","*");
        answer = phone_number.substring(0,phone_number.length()-4)+last;
        return answer;
    }
}