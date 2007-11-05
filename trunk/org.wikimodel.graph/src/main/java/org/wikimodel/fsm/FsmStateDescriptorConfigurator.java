/**
 * 
 */
package org.wikimodel.fsm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author kotelnikov
 */
public class FsmStateDescriptorConfigurator {

    private Map fDescriptors = new HashMap();

    private Stack fDescriptorStack = new Stack();

    /**
     * 
     */
    public FsmStateDescriptorConfigurator() {
    }

    public void beginState(String stateKey) {
        beginState(stateKey, new HashMap());
    }

    public void beginState(String stateKey, Map params) {
        FsmStateDescriptor descriptor = newDescriptor(stateKey, params);
        FsmStateDescriptor parentDescriptor = (FsmStateDescriptor) (!fDescriptorStack
            .empty() ? fDescriptorStack.peek() : null);
        if (parentDescriptor != null) {
            parentDescriptor.addSubstateDescriptor(stateKey, descriptor);
        } else {
            setRootDescriptor(stateKey, descriptor);
        }
        fDescriptorStack.push(descriptor);
    }

    public void endState() {
        if (!fDescriptorStack.empty())
            fDescriptorStack.pop();
    }

    /**
     * @param key the key of the root state to return
     * @return a root state descriptor corresponding to the specified state key
     */
    public FsmStateDescriptor getDescriptor(String key) {
        return (FsmStateDescriptor) fDescriptors.get(key);
    }

    protected FsmStateDescriptor newDescriptor(String stateKey, Map params) {
        return new FsmStateDescriptor();
    }

    public FsmProcess newProcess(String stateKey, IFsmProcessListener listener) {
        FsmStateDescriptor descriptor = getDescriptor(stateKey);
        if (descriptor == null) {
            throw new IllegalArgumentException("Bad process key. "
                + "There  is no state descriptor for the  key '"
                + stateKey
                + "'.");
        }
        return new FsmProcess(descriptor, stateKey, listener);
    }

    public void onTransition(String from, String event, String to) {
        FsmStateDescriptor parentDescriptor = (FsmStateDescriptor) (!fDescriptorStack
            .empty() ? fDescriptorStack.peek() : null);
        parentDescriptor.addTransition(from, event, to);
    }

    protected void setRootDescriptor(
        String stateKey,
        FsmStateDescriptor descriptor) {
        fDescriptors.put(stateKey, descriptor);
    }
}
