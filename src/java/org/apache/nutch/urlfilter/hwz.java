package org.apache.nutch.urlfilter;

// JDK imports
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Hadoop imports
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.nutch.net.*;
import org.apache.nutch.util.NutchConfiguration;

/**
 * @author belson
 *
 */

public class hwz implements URLFilter {

    private final static Log LOG = LogFactory.getLog(hwz.class);
    private final static String RULE = "(http)(:)(\\/)(\\/)(forums\\.hardwarezone\\.com\\.sg)(\\/)(money)(-)(mind)(-)(210)(\\/)(.*?(\\.)(html))*"; 

    private Configuration conf;
    
    public hwz() {}
    
    public synchronized String filter(String url)
    {
        try 
        {
            return Pattern.compile(RULE).matcher(url).find() ? url : null;
        } 
        catch (PatternSyntaxException e) {
            LOG.debug("Error with the provided rule pattern: " + e);
            return null;
        }
    }
    
    public void setConf(Configuration conf) { this.conf = conf; }
    
    public Configuration getConf() { return this.conf; }
}
