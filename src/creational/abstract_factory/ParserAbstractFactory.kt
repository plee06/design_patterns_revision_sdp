package creational.abstract_factory



/**
 * Our Abstract Factory for different types of XML Parsers
 *
 *
 * */

interface ParserAbstractFactory {


    fun getParserInstance(parserType: String)
}