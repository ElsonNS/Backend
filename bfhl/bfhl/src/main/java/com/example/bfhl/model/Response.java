package com.example.bfhl.model;

import java.util.List;
public class Response {
    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;
    private List<String> numbers;
    private List<String> alphabets;
    private String highest_lowercase_alphabet;

    public boolean getIsSuccess() {
        return is_success;
    }

    public void setIsSuccess(boolean is_success) {
        this.is_success = is_success;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return roll_number;
    }

    public void setRollNumber(String roll_number) {
        this.roll_number = roll_number;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public String getHighestLowercaseAlphabet() {
        return highest_lowercase_alphabet;
    }

    public void setHighestLowercaseAlphabet(String highest_lowercase_alphabet) {
        this.highest_lowercase_alphabet = highest_lowercase_alphabet;
    }
}
