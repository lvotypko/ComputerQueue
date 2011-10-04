package org.jenkinsci.plugins.computerqueue;

import hudson.Extension;
import hudson.model.Hudson;
import hudson.model.ComputerPanelBox;
import hudson.model.Queue.BuildableItem;
import java.util.List;

/**
 * Add a box with a queue of tasks for given computer to its page
 * 
 * @author Lucie Votypkova
 */
@Extension
public class ComputerQueue extends ComputerPanelBox {

    public List<BuildableItem> items() {
        return Hudson.getInstance().getQueue().getBuildableItems(super.getComputer());
    }
    
}
