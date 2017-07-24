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
public class PrimeUpLogstashConverterDAOImpl implements PrimeUpLogstashConverterDAO {
    
    @Override
    public String convert(String command){
        return "Funciona";
    }
    
    @Override
    public String test(){
        return "Funcionouuuu";
    }
    
    @Override
    public String inputClauseBuilder(){
        return "";
    }
    
    @Override
    public String filterClauseBuilder(){
        return "";
    }
    
    @Override
    public String outputClauseBuilder(){
        return "";
    }
}
