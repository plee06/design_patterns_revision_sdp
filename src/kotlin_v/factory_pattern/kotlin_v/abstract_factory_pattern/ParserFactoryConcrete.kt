package kotlin_v.factory_pattern.kotlin_v.abstract_factory_pattern


//class ParserFactoryConcrete : AbstractParserFactory {
//
//    companion object {
//
//        fun getFactory(f: AbstractParserFactory, xp: XMLParser) {
//
//            when (f) {
//                is NYFactory -> NYFactory().getParser(xp)
//                is CAFactory -> CAFactory().getParser(xp)
//                else -> "Factory not available"
//            }
//        }
//    }
//
//}