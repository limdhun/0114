package org.example.vending;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Scores {
    private int kor;
    private int eng;
    private int mat;
    private int soc;
}
