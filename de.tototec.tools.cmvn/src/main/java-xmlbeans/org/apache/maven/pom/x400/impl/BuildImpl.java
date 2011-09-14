/*
 * XML Type:  Build
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Build
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Build(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class BuildImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build
{
    private static final long serialVersionUID = 1L;
    
    public BuildImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDIRECTORY$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "sourceDirectory");
    private static final javax.xml.namespace.QName SCRIPTSOURCEDIRECTORY$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "scriptSourceDirectory");
    private static final javax.xml.namespace.QName TESTSOURCEDIRECTORY$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "testSourceDirectory");
    private static final javax.xml.namespace.QName OUTPUTDIRECTORY$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "outputDirectory");
    private static final javax.xml.namespace.QName TESTOUTPUTDIRECTORY$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "testOutputDirectory");
    private static final javax.xml.namespace.QName EXTENSIONS$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "extensions");
    private static final javax.xml.namespace.QName DEFAULTGOAL$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "defaultGoal");
    private static final javax.xml.namespace.QName RESOURCES$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "resources");
    private static final javax.xml.namespace.QName TESTRESOURCES$16 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "testResources");
    private static final javax.xml.namespace.QName DIRECTORY$18 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "directory");
    private static final javax.xml.namespace.QName FINALNAME$20 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "finalName");
    private static final javax.xml.namespace.QName FILTERS$22 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "filters");
    private static final javax.xml.namespace.QName PLUGINMANAGEMENT$24 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "pluginManagement");
    private static final javax.xml.namespace.QName PLUGINS$26 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "plugins");
    
    
    /**
     * Gets the "sourceDirectory" element
     */
    public java.lang.String getSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIRECTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDIRECTORY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceDirectory" element
     */
    public boolean isSetSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEDIRECTORY$0) != 0;
        }
    }
    
    /**
     * Sets the "sourceDirectory" element
     */
    public void setSourceDirectory(java.lang.String sourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIRECTORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDIRECTORY$0);
            }
            target.setStringValue(sourceDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDirectory" element
     */
    public void xsetSourceDirectory(org.apache.xmlbeans.XmlString sourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDIRECTORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEDIRECTORY$0);
            }
            target.set(sourceDirectory);
        }
    }
    
    /**
     * Unsets the "sourceDirectory" element
     */
    public void unsetSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEDIRECTORY$0, 0);
        }
    }
    
    /**
     * Gets the "scriptSourceDirectory" element
     */
    public java.lang.String getScriptSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRIPTSOURCEDIRECTORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scriptSourceDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetScriptSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRIPTSOURCEDIRECTORY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "scriptSourceDirectory" element
     */
    public boolean isSetScriptSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPTSOURCEDIRECTORY$2) != 0;
        }
    }
    
    /**
     * Sets the "scriptSourceDirectory" element
     */
    public void setScriptSourceDirectory(java.lang.String scriptSourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCRIPTSOURCEDIRECTORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCRIPTSOURCEDIRECTORY$2);
            }
            target.setStringValue(scriptSourceDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "scriptSourceDirectory" element
     */
    public void xsetScriptSourceDirectory(org.apache.xmlbeans.XmlString scriptSourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCRIPTSOURCEDIRECTORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCRIPTSOURCEDIRECTORY$2);
            }
            target.set(scriptSourceDirectory);
        }
    }
    
    /**
     * Unsets the "scriptSourceDirectory" element
     */
    public void unsetScriptSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPTSOURCEDIRECTORY$2, 0);
        }
    }
    
    /**
     * Gets the "testSourceDirectory" element
     */
    public java.lang.String getTestSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSOURCEDIRECTORY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testSourceDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetTestSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSOURCEDIRECTORY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "testSourceDirectory" element
     */
    public boolean isSetTestSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTSOURCEDIRECTORY$4) != 0;
        }
    }
    
    /**
     * Sets the "testSourceDirectory" element
     */
    public void setTestSourceDirectory(java.lang.String testSourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSOURCEDIRECTORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTSOURCEDIRECTORY$4);
            }
            target.setStringValue(testSourceDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "testSourceDirectory" element
     */
    public void xsetTestSourceDirectory(org.apache.xmlbeans.XmlString testSourceDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSOURCEDIRECTORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTSOURCEDIRECTORY$4);
            }
            target.set(testSourceDirectory);
        }
    }
    
    /**
     * Unsets the "testSourceDirectory" element
     */
    public void unsetTestSourceDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTSOURCEDIRECTORY$4, 0);
        }
    }
    
    /**
     * Gets the "outputDirectory" element
     */
    public java.lang.String getOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTDIRECTORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outputDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTDIRECTORY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "outputDirectory" element
     */
    public boolean isSetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTDIRECTORY$6) != 0;
        }
    }
    
    /**
     * Sets the "outputDirectory" element
     */
    public void setOutputDirectory(java.lang.String outputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTDIRECTORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUTDIRECTORY$6);
            }
            target.setStringValue(outputDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "outputDirectory" element
     */
    public void xsetOutputDirectory(org.apache.xmlbeans.XmlString outputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTDIRECTORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTPUTDIRECTORY$6);
            }
            target.set(outputDirectory);
        }
    }
    
    /**
     * Unsets the "outputDirectory" element
     */
    public void unsetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTDIRECTORY$6, 0);
        }
    }
    
    /**
     * Gets the "testOutputDirectory" element
     */
    public java.lang.String getTestOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTOUTPUTDIRECTORY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testOutputDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetTestOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTOUTPUTDIRECTORY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "testOutputDirectory" element
     */
    public boolean isSetTestOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTOUTPUTDIRECTORY$8) != 0;
        }
    }
    
    /**
     * Sets the "testOutputDirectory" element
     */
    public void setTestOutputDirectory(java.lang.String testOutputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTOUTPUTDIRECTORY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTOUTPUTDIRECTORY$8);
            }
            target.setStringValue(testOutputDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "testOutputDirectory" element
     */
    public void xsetTestOutputDirectory(org.apache.xmlbeans.XmlString testOutputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTOUTPUTDIRECTORY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTOUTPUTDIRECTORY$8);
            }
            target.set(testOutputDirectory);
        }
    }
    
    /**
     * Unsets the "testOutputDirectory" element
     */
    public void unsetTestOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTOUTPUTDIRECTORY$8, 0);
        }
    }
    
    /**
     * Gets the "extensions" element
     */
    public org.apache.maven.pom.x400.Build.Extensions getExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Extensions target = null;
            target = (org.apache.maven.pom.x400.Build.Extensions)get_store().find_element_user(EXTENSIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extensions" element
     */
    public boolean isSetExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "extensions" element
     */
    public void setExtensions(org.apache.maven.pom.x400.Build.Extensions extensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Extensions target = null;
            target = (org.apache.maven.pom.x400.Build.Extensions)get_store().find_element_user(EXTENSIONS$10, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build.Extensions)get_store().add_element_user(EXTENSIONS$10);
            }
            target.set(extensions);
        }
    }
    
    /**
     * Appends and returns a new empty "extensions" element
     */
    public org.apache.maven.pom.x400.Build.Extensions addNewExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Extensions target = null;
            target = (org.apache.maven.pom.x400.Build.Extensions)get_store().add_element_user(EXTENSIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "extensions" element
     */
    public void unsetExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIONS$10, 0);
        }
    }
    
    /**
     * Gets the "defaultGoal" element
     */
    public java.lang.String getDefaultGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTGOAL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultGoal" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTGOAL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultGoal" element
     */
    public boolean isSetDefaultGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTGOAL$12) != 0;
        }
    }
    
    /**
     * Sets the "defaultGoal" element
     */
    public void setDefaultGoal(java.lang.String defaultGoal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTGOAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTGOAL$12);
            }
            target.setStringValue(defaultGoal);
        }
    }
    
    /**
     * Sets (as xml) the "defaultGoal" element
     */
    public void xsetDefaultGoal(org.apache.xmlbeans.XmlString defaultGoal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTGOAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTGOAL$12);
            }
            target.set(defaultGoal);
        }
    }
    
    /**
     * Unsets the "defaultGoal" element
     */
    public void unsetDefaultGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTGOAL$12, 0);
        }
    }
    
    /**
     * Gets the "resources" element
     */
    public org.apache.maven.pom.x400.Build.Resources getResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Resources target = null;
            target = (org.apache.maven.pom.x400.Build.Resources)get_store().find_element_user(RESOURCES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resources" element
     */
    public boolean isSetResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCES$14) != 0;
        }
    }
    
    /**
     * Sets the "resources" element
     */
    public void setResources(org.apache.maven.pom.x400.Build.Resources resources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Resources target = null;
            target = (org.apache.maven.pom.x400.Build.Resources)get_store().find_element_user(RESOURCES$14, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build.Resources)get_store().add_element_user(RESOURCES$14);
            }
            target.set(resources);
        }
    }
    
    /**
     * Appends and returns a new empty "resources" element
     */
    public org.apache.maven.pom.x400.Build.Resources addNewResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Resources target = null;
            target = (org.apache.maven.pom.x400.Build.Resources)get_store().add_element_user(RESOURCES$14);
            return target;
        }
    }
    
    /**
     * Unsets the "resources" element
     */
    public void unsetResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCES$14, 0);
        }
    }
    
    /**
     * Gets the "testResources" element
     */
    public org.apache.maven.pom.x400.Build.TestResources getTestResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.TestResources target = null;
            target = (org.apache.maven.pom.x400.Build.TestResources)get_store().find_element_user(TESTRESOURCES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "testResources" element
     */
    public boolean isSetTestResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTRESOURCES$16) != 0;
        }
    }
    
    /**
     * Sets the "testResources" element
     */
    public void setTestResources(org.apache.maven.pom.x400.Build.TestResources testResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.TestResources target = null;
            target = (org.apache.maven.pom.x400.Build.TestResources)get_store().find_element_user(TESTRESOURCES$16, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build.TestResources)get_store().add_element_user(TESTRESOURCES$16);
            }
            target.set(testResources);
        }
    }
    
    /**
     * Appends and returns a new empty "testResources" element
     */
    public org.apache.maven.pom.x400.Build.TestResources addNewTestResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.TestResources target = null;
            target = (org.apache.maven.pom.x400.Build.TestResources)get_store().add_element_user(TESTRESOURCES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "testResources" element
     */
    public void unsetTestResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTRESOURCES$16, 0);
        }
    }
    
    /**
     * Gets the "directory" element
     */
    public java.lang.String getDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "directory" element
     */
    public org.apache.xmlbeans.XmlString xgetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "directory" element
     */
    public boolean isSetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTORY$18) != 0;
        }
    }
    
    /**
     * Sets the "directory" element
     */
    public void setDirectory(java.lang.String directory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$18);
            }
            target.setStringValue(directory);
        }
    }
    
    /**
     * Sets (as xml) the "directory" element
     */
    public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$18);
            }
            target.set(directory);
        }
    }
    
    /**
     * Unsets the "directory" element
     */
    public void unsetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTORY$18, 0);
        }
    }
    
    /**
     * Gets the "finalName" element
     */
    public java.lang.String getFinalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALNAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "finalName" element
     */
    public org.apache.xmlbeans.XmlString xgetFinalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALNAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "finalName" element
     */
    public boolean isSetFinalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINALNAME$20) != 0;
        }
    }
    
    /**
     * Sets the "finalName" element
     */
    public void setFinalName(java.lang.String finalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINALNAME$20);
            }
            target.setStringValue(finalName);
        }
    }
    
    /**
     * Sets (as xml) the "finalName" element
     */
    public void xsetFinalName(org.apache.xmlbeans.XmlString finalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINALNAME$20);
            }
            target.set(finalName);
        }
    }
    
    /**
     * Unsets the "finalName" element
     */
    public void unsetFinalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINALNAME$20, 0);
        }
    }
    
    /**
     * Gets the "filters" element
     */
    public org.apache.maven.pom.x400.Build.Filters getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Filters target = null;
            target = (org.apache.maven.pom.x400.Build.Filters)get_store().find_element_user(FILTERS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$22) != 0;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(org.apache.maven.pom.x400.Build.Filters filters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Filters target = null;
            target = (org.apache.maven.pom.x400.Build.Filters)get_store().find_element_user(FILTERS$22, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build.Filters)get_store().add_element_user(FILTERS$22);
            }
            target.set(filters);
        }
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public org.apache.maven.pom.x400.Build.Filters addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Filters target = null;
            target = (org.apache.maven.pom.x400.Build.Filters)get_store().add_element_user(FILTERS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$22, 0);
        }
    }
    
    /**
     * Gets the "pluginManagement" element
     */
    public org.apache.maven.pom.x400.PluginManagement getPluginManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement target = null;
            target = (org.apache.maven.pom.x400.PluginManagement)get_store().find_element_user(PLUGINMANAGEMENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pluginManagement" element
     */
    public boolean isSetPluginManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINMANAGEMENT$24) != 0;
        }
    }
    
    /**
     * Sets the "pluginManagement" element
     */
    public void setPluginManagement(org.apache.maven.pom.x400.PluginManagement pluginManagement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement target = null;
            target = (org.apache.maven.pom.x400.PluginManagement)get_store().find_element_user(PLUGINMANAGEMENT$24, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.PluginManagement)get_store().add_element_user(PLUGINMANAGEMENT$24);
            }
            target.set(pluginManagement);
        }
    }
    
    /**
     * Appends and returns a new empty "pluginManagement" element
     */
    public org.apache.maven.pom.x400.PluginManagement addNewPluginManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement target = null;
            target = (org.apache.maven.pom.x400.PluginManagement)get_store().add_element_user(PLUGINMANAGEMENT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "pluginManagement" element
     */
    public void unsetPluginManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINMANAGEMENT$24, 0);
        }
    }
    
    /**
     * Gets the "plugins" element
     */
    public org.apache.maven.pom.x400.Build.Plugins getPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Plugins target = null;
            target = (org.apache.maven.pom.x400.Build.Plugins)get_store().find_element_user(PLUGINS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plugins" element
     */
    public boolean isSetPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINS$26) != 0;
        }
    }
    
    /**
     * Sets the "plugins" element
     */
    public void setPlugins(org.apache.maven.pom.x400.Build.Plugins plugins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Plugins target = null;
            target = (org.apache.maven.pom.x400.Build.Plugins)get_store().find_element_user(PLUGINS$26, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build.Plugins)get_store().add_element_user(PLUGINS$26);
            }
            target.set(plugins);
        }
    }
    
    /**
     * Appends and returns a new empty "plugins" element
     */
    public org.apache.maven.pom.x400.Build.Plugins addNewPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build.Plugins target = null;
            target = (org.apache.maven.pom.x400.Build.Plugins)get_store().add_element_user(PLUGINS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "plugins" element
     */
    public void unsetPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINS$26, 0);
        }
    }
    /**
     * An XML extensions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ExtensionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build.Extensions
    {
        private static final long serialVersionUID = 1L;
        
        public ExtensionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTENSION$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "extension");
        
        
        /**
         * Gets array of all "extension" elements
         */
        public org.apache.maven.pom.x400.Extension[] getExtensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENSION$0, targetList);
                org.apache.maven.pom.x400.Extension[] result = new org.apache.maven.pom.x400.Extension[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extension" element
         */
        public org.apache.maven.pom.x400.Extension getExtensionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Extension target = null;
                target = (org.apache.maven.pom.x400.Extension)get_store().find_element_user(EXTENSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extension" element
         */
        public int sizeOfExtensionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENSION$0);
            }
        }
        
        /**
         * Sets array of all "extension" element
         */
        public void setExtensionArray(org.apache.maven.pom.x400.Extension[] extensionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extensionArray, EXTENSION$0);
            }
        }
        
        /**
         * Sets ith "extension" element
         */
        public void setExtensionArray(int i, org.apache.maven.pom.x400.Extension extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Extension target = null;
                target = (org.apache.maven.pom.x400.Extension)get_store().find_element_user(EXTENSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extension);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        public org.apache.maven.pom.x400.Extension insertNewExtension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Extension target = null;
                target = (org.apache.maven.pom.x400.Extension)get_store().insert_element_user(EXTENSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        public org.apache.maven.pom.x400.Extension addNewExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Extension target = null;
                target = (org.apache.maven.pom.x400.Extension)get_store().add_element_user(EXTENSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "extension" element
         */
        public void removeExtension(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENSION$0, i);
            }
        }
    }
    /**
     * An XML resources(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build.Resources
    {
        private static final long serialVersionUID = 1L;
        
        public ResourcesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "resource");
        
        
        /**
         * Gets array of all "resource" elements
         */
        public org.apache.maven.pom.x400.Resource[] getResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCE$0, targetList);
                org.apache.maven.pom.x400.Resource[] result = new org.apache.maven.pom.x400.Resource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource" element
         */
        public org.apache.maven.pom.x400.Resource getResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().find_element_user(RESOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource" element
         */
        public int sizeOfResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCE$0);
            }
        }
        
        /**
         * Sets array of all "resource" element
         */
        public void setResourceArray(org.apache.maven.pom.x400.Resource[] resourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourceArray, RESOURCE$0);
            }
        }
        
        /**
         * Sets ith "resource" element
         */
        public void setResourceArray(int i, org.apache.maven.pom.x400.Resource resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().find_element_user(RESOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resource);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource" element
         */
        public org.apache.maven.pom.x400.Resource insertNewResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().insert_element_user(RESOURCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource" element
         */
        public org.apache.maven.pom.x400.Resource addNewResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().add_element_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource" element
         */
        public void removeResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCE$0, i);
            }
        }
    }
    /**
     * An XML testResources(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class TestResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build.TestResources
    {
        private static final long serialVersionUID = 1L;
        
        public TestResourcesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTRESOURCE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "testResource");
        
        
        /**
         * Gets array of all "testResource" elements
         */
        public org.apache.maven.pom.x400.Resource[] getTestResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTRESOURCE$0, targetList);
                org.apache.maven.pom.x400.Resource[] result = new org.apache.maven.pom.x400.Resource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testResource" element
         */
        public org.apache.maven.pom.x400.Resource getTestResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().find_element_user(TESTRESOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testResource" element
         */
        public int sizeOfTestResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTRESOURCE$0);
            }
        }
        
        /**
         * Sets array of all "testResource" element
         */
        public void setTestResourceArray(org.apache.maven.pom.x400.Resource[] testResourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testResourceArray, TESTRESOURCE$0);
            }
        }
        
        /**
         * Sets ith "testResource" element
         */
        public void setTestResourceArray(int i, org.apache.maven.pom.x400.Resource testResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().find_element_user(TESTRESOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testResource);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testResource" element
         */
        public org.apache.maven.pom.x400.Resource insertNewTestResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().insert_element_user(TESTRESOURCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testResource" element
         */
        public org.apache.maven.pom.x400.Resource addNewTestResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Resource target = null;
                target = (org.apache.maven.pom.x400.Resource)get_store().add_element_user(TESTRESOURCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "testResource" element
         */
        public void removeTestResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTRESOURCE$0, i);
            }
        }
    }
    /**
     * An XML filters(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class FiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build.Filters
    {
        private static final long serialVersionUID = 1L;
        
        public FiltersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILTER$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "filter");
        
        
        /**
         * Gets array of all "filter" elements
         */
        public java.lang.String[] getFilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILTER$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "filter" element
         */
        public java.lang.String getFilterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "filter" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetFilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILTER$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "filter" element
         */
        public org.apache.xmlbeans.XmlString xgetFilterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "filter" element
         */
        public int sizeOfFilterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILTER$0);
            }
        }
        
        /**
         * Sets array of all "filter" element
         */
        public void setFilterArray(java.lang.String[] filterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(filterArray, FILTER$0);
            }
        }
        
        /**
         * Sets ith "filter" element
         */
        public void setFilterArray(int i, java.lang.String filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(filter);
            }
        }
        
        /**
         * Sets (as xml) array of all "filter" element
         */
        public void xsetFilterArray(org.apache.xmlbeans.XmlString[]filterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(filterArray, FILTER$0);
            }
        }
        
        /**
         * Sets (as xml) ith "filter" element
         */
        public void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(filter);
            }
        }
        
        /**
         * Inserts the value as the ith "filter" element
         */
        public void insertFilter(int i, java.lang.String filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FILTER$0, i);
                target.setStringValue(filter);
            }
        }
        
        /**
         * Appends the value as the last "filter" element
         */
        public void addFilter(java.lang.String filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTER$0);
                target.setStringValue(filter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "filter" element
         */
        public org.apache.xmlbeans.XmlString insertNewFilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FILTER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "filter" element
         */
        public org.apache.xmlbeans.XmlString addNewFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "filter" element
         */
        public void removeFilter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILTER$0, i);
            }
        }
    }
    /**
     * An XML plugins(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PluginsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Build.Plugins
    {
        private static final long serialVersionUID = 1L;
        
        public PluginsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLUGIN$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "plugin");
        
        
        /**
         * Gets array of all "plugin" elements
         */
        public org.apache.maven.pom.x400.Plugin[] getPluginArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLUGIN$0, targetList);
                org.apache.maven.pom.x400.Plugin[] result = new org.apache.maven.pom.x400.Plugin[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "plugin" element
         */
        public org.apache.maven.pom.x400.Plugin getPluginArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().find_element_user(PLUGIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "plugin" element
         */
        public int sizeOfPluginArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLUGIN$0);
            }
        }
        
        /**
         * Sets array of all "plugin" element
         */
        public void setPluginArray(org.apache.maven.pom.x400.Plugin[] pluginArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pluginArray, PLUGIN$0);
            }
        }
        
        /**
         * Sets ith "plugin" element
         */
        public void setPluginArray(int i, org.apache.maven.pom.x400.Plugin plugin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().find_element_user(PLUGIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(plugin);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plugin" element
         */
        public org.apache.maven.pom.x400.Plugin insertNewPlugin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().insert_element_user(PLUGIN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plugin" element
         */
        public org.apache.maven.pom.x400.Plugin addNewPlugin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().add_element_user(PLUGIN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "plugin" element
         */
        public void removePlugin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLUGIN$0, i);
            }
        }
    }
}
