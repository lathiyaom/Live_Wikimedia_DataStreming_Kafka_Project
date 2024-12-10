package net.javaguides.springboot.Repository;

import net.javaguides.springboot.Entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaDataRepository  extends JpaRepository<WikimediaData,Long>
{
}
