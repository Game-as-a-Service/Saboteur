package tw.waterballsa.gaas.saboteur.spring.repositories.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tw.waterballsa.gaas.saboteur.spring.repositories.data.WalkingSkeletonData;

@Repository
public
interface WalkingSkeletonDAO extends MongoRepository<WalkingSkeletonData, String> {
}
