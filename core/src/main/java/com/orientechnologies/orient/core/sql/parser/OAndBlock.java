/* Generated By:JJTree: Do not edit this line. OAndBlock.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.ArrayList;
import java.util.List;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public class OAndBlock extends OBooleanExpression {
  List<OBooleanExpression> subBlocks = new ArrayList<OBooleanExpression>();

  public OAndBlock(int id) {
    super(id);
  }

  public OAndBlock(OrientSql p, int id) {
    super(p, id);
  }

  @Override
  public boolean evaluate(OIdentifiable currentRecord) {

    if (getSubBlocks() == null) {
      return true;
    }

    for (OBooleanExpression block : subBlocks) {
      if (!block.evaluate(currentRecord)) {
        return false;
      }
    }
    return true;

  }

  public List<OBooleanExpression> getSubBlocks() {
    return subBlocks;
  }

  public void setSubBlocks(List<OBooleanExpression> subBlocks) {
    this.subBlocks = subBlocks;
  }
}
/* JavaCC - OriginalChecksum=cf1f66cc86cfc93d357f9fcdfa4a4604 (do not edit this line) */