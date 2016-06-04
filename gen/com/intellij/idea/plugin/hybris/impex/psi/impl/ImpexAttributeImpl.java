// This is a generated file. Not intended for manual editing.
package com.intellij.idea.plugin.hybris.impex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.idea.plugin.hybris.impex.psi.ImpexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.idea.plugin.hybris.impex.psi.*;

public class ImpexAttributeImpl extends ASTWrapperPsiElement implements ImpexAttribute {

  public ImpexAttributeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ImpexVisitor) ((ImpexVisitor)visitor).visitAttribute(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ImpexAnyAttributeName getAnyAttributeName() {
    return findNotNullChildByClass(ImpexAnyAttributeName.class);
  }

  @Override
  @Nullable
  public ImpexAnyAttributeValue getAnyAttributeValue() {
    return findChildByClass(ImpexAnyAttributeValue.class);
  }

}
