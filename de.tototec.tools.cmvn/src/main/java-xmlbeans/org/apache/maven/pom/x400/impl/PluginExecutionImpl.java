/*
 * XML Type:  PluginExecution
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.PluginExecution
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML PluginExecution(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class PluginExecutionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.PluginExecution
{
    private static final long serialVersionUID = 1L;
    
    public PluginExecutionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "id");
    private static final javax.xml.namespace.QName PHASE$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "phase");
    private static final javax.xml.namespace.QName GOALS$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "goals");
    private static final javax.xml.namespace.QName INHERITED$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "inherited");
    private static final javax.xml.namespace.QName CONFIGURATION$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "configuration");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "phase" element
     */
    public java.lang.String getPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phase" element
     */
    public org.apache.xmlbeans.XmlString xgetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHASE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "phase" element
     */
    public boolean isSetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHASE$2) != 0;
        }
    }
    
    /**
     * Sets the "phase" element
     */
    public void setPhase(java.lang.String phase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHASE$2);
            }
            target.setStringValue(phase);
        }
    }
    
    /**
     * Sets (as xml) the "phase" element
     */
    public void xsetPhase(org.apache.xmlbeans.XmlString phase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHASE$2);
            }
            target.set(phase);
        }
    }
    
    /**
     * Unsets the "phase" element
     */
    public void unsetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHASE$2, 0);
        }
    }
    
    /**
     * Gets the "goals" element
     */
    public org.apache.maven.pom.x400.PluginExecution.Goals getGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Goals target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Goals)get_store().find_element_user(GOALS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "goals" element
     */
    public boolean isSetGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOALS$4) != 0;
        }
    }
    
    /**
     * Sets the "goals" element
     */
    public void setGoals(org.apache.maven.pom.x400.PluginExecution.Goals goals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Goals target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Goals)get_store().find_element_user(GOALS$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.PluginExecution.Goals)get_store().add_element_user(GOALS$4);
            }
            target.set(goals);
        }
    }
    
    /**
     * Appends and returns a new empty "goals" element
     */
    public org.apache.maven.pom.x400.PluginExecution.Goals addNewGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Goals target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Goals)get_store().add_element_user(GOALS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "goals" element
     */
    public void unsetGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOALS$4, 0);
        }
    }
    
    /**
     * Gets the "inherited" element
     */
    public java.lang.String getInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inherited" element
     */
    public org.apache.xmlbeans.XmlString xgetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "inherited" element
     */
    public boolean isSetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INHERITED$6) != 0;
        }
    }
    
    /**
     * Sets the "inherited" element
     */
    public void setInherited(java.lang.String inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITED$6);
            }
            target.setStringValue(inherited);
        }
    }
    
    /**
     * Sets (as xml) the "inherited" element
     */
    public void xsetInherited(org.apache.xmlbeans.XmlString inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INHERITED$6);
            }
            target.set(inherited);
        }
    }
    
    /**
     * Unsets the "inherited" element
     */
    public void unsetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INHERITED$6, 0);
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.maven.pom.x400.PluginExecution.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Configuration target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Configuration)get_store().find_element_user(CONFIGURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "configuration" element
     */
    public boolean isSetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.maven.pom.x400.PluginExecution.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Configuration target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Configuration)get_store().find_element_user(CONFIGURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.PluginExecution.Configuration)get_store().add_element_user(CONFIGURATION$8);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.maven.pom.x400.PluginExecution.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginExecution.Configuration target = null;
            target = (org.apache.maven.pom.x400.PluginExecution.Configuration)get_store().add_element_user(CONFIGURATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "configuration" element
     */
    public void unsetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGURATION$8, 0);
        }
    }
    /**
     * An XML goals(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class GoalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.PluginExecution.Goals
    {
        private static final long serialVersionUID = 1L;
        
        public GoalsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GOAL$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "goal");
        
        
        /**
         * Gets array of all "goal" elements
         */
        public java.lang.String[] getGoalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GOAL$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "goal" element
         */
        public java.lang.String getGoalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "goal" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetGoalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GOAL$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "goal" element
         */
        public org.apache.xmlbeans.XmlString xgetGoalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "goal" element
         */
        public int sizeOfGoalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GOAL$0);
            }
        }
        
        /**
         * Sets array of all "goal" element
         */
        public void setGoalArray(java.lang.String[] goalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(goalArray, GOAL$0);
            }
        }
        
        /**
         * Sets ith "goal" element
         */
        public void setGoalArray(int i, java.lang.String goal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(goal);
            }
        }
        
        /**
         * Sets (as xml) array of all "goal" element
         */
        public void xsetGoalArray(org.apache.xmlbeans.XmlString[]goalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(goalArray, GOAL$0);
            }
        }
        
        /**
         * Sets (as xml) ith "goal" element
         */
        public void xsetGoalArray(int i, org.apache.xmlbeans.XmlString goal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(goal);
            }
        }
        
        /**
         * Inserts the value as the ith "goal" element
         */
        public void insertGoal(int i, java.lang.String goal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GOAL$0, i);
                target.setStringValue(goal);
            }
        }
        
        /**
         * Appends the value as the last "goal" element
         */
        public void addGoal(java.lang.String goal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOAL$0);
                target.setStringValue(goal);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "goal" element
         */
        public org.apache.xmlbeans.XmlString insertNewGoal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(GOAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "goal" element
         */
        public org.apache.xmlbeans.XmlString addNewGoal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "goal" element
         */
        public void removeGoal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GOAL$0, i);
            }
        }
    }
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.PluginExecution.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
