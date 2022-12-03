package tw.waterballsa.gaas.saboteur.spring.repositories;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tw.waterballsa.gaas.saboteur.app.repositories.WalkingSkeletonRepository;
import tw.waterballsa.gaas.saboteur.domain.WalkingSkeleton;
import tw.waterballsa.gaas.saboteur.spring.repositories.dao.WalkingSkeletonDAO;
import tw.waterballsa.gaas.saboteur.spring.repositories.data.WalkingSkeletonData;

@Component
@AllArgsConstructor
public class SpringWalkingSkeletonRepository implements WalkingSkeletonRepository {
    private final WalkingSkeletonDAO dao;
    @Override
    public WalkingSkeleton walk(String value) {
        if (dao.count() == 0) {
            WalkingSkeletonData data = new WalkingSkeletonData();
            data.setValue(value);
            dao.save(data);
        }
        WalkingSkeletonData data = dao.findAll().stream().findFirst().orElseThrow();
        return new WalkingSkeleton(data.getId(), data.getValue());
    }

}
