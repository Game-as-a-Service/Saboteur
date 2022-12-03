package tw.waterballsa.gaas.saboteur.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WalkingSkeleton {
    String id;
    String value;
    public String walk() {
        return value;
    }
}
