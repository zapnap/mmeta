package test;

public enum Tokens {
  // Keywords first
  tBEGIN,
  tEND,
  t__ENCODING__,
  t__FILE__,
  t__LINE__,
  tAlias,
  tAnd,
  tBegin,
  tBreak,
  tCase,
  tClass,
  tDef,
  tDefined,
  tDo,
  tElse,
  tElsif,
  tEnd,
  tEnsure,
  tFalse,
  tFor,
  tIf,
  tIn,
  tModule,
  tNext,
  tNil,
  tNot,
  tOr,
  tRedo,
  tRescue,
  tRetry,
  tReturn,
  tSelf,
  tSuper,
  tThen,
  tTrue,
  tUndef,
  tUnless,
  tUntil,
  tWhen,
  tWhile,
  tYield,
  // ClassVar must be first after the keywords, followed by other
  // identifierish tokens.
  tClassVar,
  tInstVar,
  tCONSTANT,
  tIDENTIFIER,
  tFID,
  // FID must be last identifierish token.
  tNL,
  tSemi,
  tSlash,
  tQuote,
  tColons,
  tColon,
  tDot,
  tLParen,
  tLBrack,
  tLBrace,
  tBang,
  tNMatch,
  tNE,
  tLT,
  tLE,
  tLEG,
  tLShift,
  tLLShift,
  tGT,
  tGE,
  tRShift,
  tEEQ,
  tEEEQ,
  tMatch,
  tEQ,
  tAndEq,
  tOrEq,
  tOpAssign,
  tQuestion,
  tDigit,
  tBacktick,
  tDollar,
  tUNKNOWN,
  tEOF
}
