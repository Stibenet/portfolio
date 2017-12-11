package ru.ugrasu.portfolio.models.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import ru.ugrasu.portfolio.exception.DbEntityNotFoundException;
import ru.ugrasu.portfolio.models.entities.KnowledgeEntity;
import ru.ugrasu.portfolio.models.repositories.KnowledgeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
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
   /* //TODO
    @Test(expected = DbEntityNotFoundException.class)
    public void createKnowsMustReturnRunTimeException() throws DbEntityNotFoundException {
        KnowledgeEntity k = new KnowledgeEntity();
        when(knowledgeRepository.save(k)).thenReturn(null);
        knowledgeService.createKnows(k);
    }*/

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
   /* //TODO
    @Test(expected = DbEntityNotFoundException.class)
    public void updateKnowsMustReturnRunTimeException() throws DbEntityNotFoundException {
        KnowledgeEntity k = new KnowledgeEntity();
        when(knowledgeRepository.save(k)).thenReturn(null);
        knowledgeService.updateKnows(k);
    }*/

    @Test
    public void deleteKnows() throws Exception {
        //prepare
        KnowledgeEntity k = new KnowledgeEntity();
        k.setIdKnowledge(1);
        k.setNameKnowledge("test");
        k.setPeriodStudy("test2");
        KnowledgeService mock;

        mock = Mockito.mock(KnowledgeService.class);
        Mockito.doThrow(new IllegalArgumentException()).when(mock).deleteKnows(2);
        try {
            mock.deleteKnows(2);
            //Assert.fail();

        } catch (IllegalArgumentException e) {
            System.out.println("er");
            //e.getMessage();
        }
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
    @Test(expected = DbEntityNotFoundException.class)
    public void findByIdMustReturnRunTimeException() throws DbEntityNotFoundException {
        when(knowledgeRepository.findOne(Integer.MIN_VALUE)).thenReturn(null);
        knowledgeService.findById(Integer.MIN_VALUE);
    }
}