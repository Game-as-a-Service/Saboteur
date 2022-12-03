package tw.waterballsa.gaas.saboteur.app.usecases;

import lombok.AllArgsConstructor;
import tw.waterballsa.gaas.saboteur.app.repositories.WalkingSkeletonRepository;
import tw.waterballsa.gaas.saboteur.domain.WalkingSkeleton;

import javax.inject.Named;

@Named
@AllArgsConstructor
public class WalkingSkeletonUseCase {
    private final WalkingSkeletonRepository walkingSkeletonRepository;

    public String execute() {
        WalkingSkeleton skeleton = walkingSkeletonRepository.walk("Walk");
        return skeleton.walk();
    }

}
