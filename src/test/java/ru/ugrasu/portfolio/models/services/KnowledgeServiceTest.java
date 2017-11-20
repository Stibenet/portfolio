package ru.ugrasu.portfolio.models.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.KnowledgeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Марсель on 20.11.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class KnowledgeServiceTest {

    @Mock
    private KnowledgeRepository knowledgeRepository;

    @InjectMocks
    private KnowledgeService knowledgeService;

    private List<KnowledgeEntity> knowledgeEntityList;

    @Before
    public void setup(){
        knowledgeEntityList = new ArrayList<>();

        KnowledgeEntity k = new KnowledgeEntity();
        k.setIdKnowledge(1);
        k.setNameKnowledge("test");
        k.setPeriodStudy("test2");

        knowledgeEntityList.add(k);
    }

    @Test
    public void createKnows() throws Exception {
        //prepare
        for (Iterator iterator = knowledgeEntityList.iterator(); iterator.hasNext(); ) {
            KnowledgeEntity knowledgeEntity = (KnowledgeEntity) iterator.next();

            //testing
            knowledgeRepository.save(knowledgeEntity);
            //validate
            assertTrue(knowledgeEntity.getNameKnowledge() + " is saved - Id "
                            + knowledgeEntity.getIdKnowledge(),
                    knowledgeEntity.getIdKnowledge() > 0);
        }
    }

    @Test
    public void updateKnows() throws Exception {
        //prepare
        for (Iterator iterator = knowledgeEntityList.iterator(); iterator.hasNext(); ) {
            KnowledgeEntity knowledgeEntity = (KnowledgeEntity) iterator.next();

            //assertTrue(!k.getNameKnowledge().isEmpty());
//        knowledgeRepository.setNameKnowledge("test");
            //testing
            knowledgeRepository.save(knowledgeEntity);
            //validate
            assertTrue(knowledgeEntity.getNameKnowledge() + " is update - Id "
                            + knowledgeEntity.getIdKnowledge(),
                    knowledgeEntity.getIdKnowledge() > 0);
        }
    }

    @Test
    public void deleteKnows() throws Exception {
        //prepare
        KnowledgeEntity k = new KnowledgeEntity();
        k.setIdKnowledge(1);
        k.setNameKnowledge("test");
        k.setPeriodStudy("test2");

        KnowledgeEntity beforeDel = knowledgeRepository.findOne(1);

        //testing
        knowledgeRepository.delete(beforeDel);
        KnowledgeEntity afterDel = knowledgeRepository.findOne(1);

        //validate
        assertNull(afterDel);
    }

    @Test
    public void findById() throws Exception {
        //prepare
        KnowledgeEntity k = new KnowledgeEntity();
        k.setIdKnowledge(2);
        k.setNameKnowledge("test");
        k.setPeriodStudy("test");

        when(knowledgeRepository.findOne(k.getIdKnowledge())).thenReturn(k);
        //testing
        KnowledgeEntity returned = knowledgeService.findById(2);
        //validate
        assertEquals(k.getIdKnowledge(), returned.getIdKnowledge());
    }

}