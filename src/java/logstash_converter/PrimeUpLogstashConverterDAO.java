/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logstash_converter;

/**
 *
 * @author gabri
 */
public interface PrimeUpLogstashConverterDAO {
    
    public String convert(String command);
    public String test();
    public String inputClauseBuilder();
    public String filterClauseBuilder();
    public String outputClauseBuilder();
    
    
}
