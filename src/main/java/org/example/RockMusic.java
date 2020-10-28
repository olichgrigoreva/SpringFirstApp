package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> rockList = new ArrayList<>();

    @Override
    public List getSong() {
        String[] arr = {"Slipknot", "System of a Down", "Metallica"};
        rockList.addAll(Arrays.asList(arr));
        return rockList;
    }
}
