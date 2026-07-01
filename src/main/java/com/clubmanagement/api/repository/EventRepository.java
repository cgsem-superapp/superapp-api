package com.clubmanagement.api.repository;
import com.clubmanagement.api.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Spring tu sinh SQL tu ten method — do la phep thuat cua Spring Data JPA
    List<Event> findByStatus(String status);
    List<Event> findByType(String type);
}