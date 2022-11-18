package rinaldifauzi.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<>(2);
    private Long counter = -1L;

    @java.lang.Override
    public java.lang.Object get(java.lang.String name, ObjectFactory<?> objectFactory) {
        counter++;
        if (objects.size() == 2){
            int index = (int) (counter % 2);
            return objects.get(index);
        }else{
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @java.lang.Override
    public java.lang.Object remove(java.lang.String name) {
        if (!objects.isEmpty()){
            return objects.remove(0);
        }
        return null;
    }

    @java.lang.Override
    public void registerDestructionCallback(java.lang.String name, java.lang.Runnable callback) {

    }

    @java.lang.Override
    public java.lang.Object resolveContextualObject(java.lang.String key) {
        return null;
    }

    @java.lang.Override
    public java.lang.String getConversationId() {
        return null;
    }
}
