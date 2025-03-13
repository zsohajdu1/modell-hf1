// Generated from D:/Documents/modell/modell-hf1/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StateModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#states}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates(StateModelParser.StatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(StateModelParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(StateModelParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#labelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelList(StateModelParser.LabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitions(StateModelParser.TransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StateModelParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(StateModelParser.TransitionContext ctx);
}