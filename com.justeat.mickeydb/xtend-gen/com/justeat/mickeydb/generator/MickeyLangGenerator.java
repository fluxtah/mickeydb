/**
 * generated by Xtext
 */
package com.justeat.mickeydb.generator;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.justeat.mickeydb.MickeyAssembler;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.MickeyModel;
import com.justeat.mickeydb.ModelUtil;
import com.justeat.mickeydb.Strings;
import com.justeat.mickeydb.generator.ActiveRecordGenerator;
import com.justeat.mickeydb.generator.ContentProviderContractGenerator;
import com.justeat.mickeydb.generator.ContentProviderGenerator;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.generator.SqliteMigrationGenerator;
import com.justeat.mickeydb.generator.SqliteOpenHelperGenerator;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MickeyLangGenerator implements IGenerator {
  @Inject
  private SqliteOpenHelperGenerator mOpenHelperGenerator;
  
  @Inject
  private ContentProviderContractGenerator mContentProviderContractGenerator;
  
  @Inject
  private ContentProviderGenerator mContentProviderGenerator;
  
  @Inject
  private Provider<SqliteMigrationGenerator> mMigrationGenerator;
  
  @Inject
  private ActiveRecordGenerator mActiveRecordGenerator;
  
  @Inject
  private MickeyAssembler assembler;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String _string = _uRI.toString();
    boolean _contains = _string.contains("init.mickey");
    boolean _not = (!_contains);
    if (_not) {
      return;
    }
    MickeyModel mickeyModel = this.assembler.assemble(resource);
    final String stubOutput = "";
    Collection<MickeyDatabaseModel> _values = mickeyModel.databases.values();
    final Consumer<MickeyDatabaseModel> _function = (MickeyDatabaseModel it) -> {
      String _packageName = it.getPackageName();
      String _databaseName = it.getDatabaseName();
      String _pascalize = Strings.pascalize(_databaseName);
      String _concat = "Abstract".concat(_pascalize);
      String _concat_1 = _concat.concat("OpenHelper");
      String _resolveFileName = Strings.resolveFileName(_packageName, _concat_1);
      CharSequence _generate = this.mOpenHelperGenerator.generate(it);
      fsa.generateFile(_resolveFileName, _generate);
      String _packageName_1 = it.getPackageName();
      String _databaseName_1 = it.getDatabaseName();
      String _pascalize_1 = Strings.pascalize(_databaseName_1);
      String _concat_2 = _pascalize_1.concat("Contract");
      String _resolveFileName_1 = Strings.resolveFileName(_packageName_1, _concat_2);
      CharSequence _generate_1 = this.mContentProviderContractGenerator.generate(it);
      fsa.generateFile(_resolveFileName_1, _generate_1);
      String _packageName_2 = it.getPackageName();
      String _databaseName_2 = it.getDatabaseName();
      String _pascalize_2 = Strings.pascalize(_databaseName_2);
      String _concat_3 = "Abstract".concat(_pascalize_2);
      String _concat_4 = _concat_3.concat("ContentProvider");
      String _resolveFileName_2 = Strings.resolveFileName(_packageName_2, _concat_4);
      CharSequence _generate_2 = this.mContentProviderGenerator.generate(it);
      fsa.generateFile(_resolveFileName_2, _generate_2);
      SqliteDatabaseSnapshot _snapshot = it.getSnapshot();
      ArrayList<CreateTableStatement> _tables = _snapshot.getTables();
      final Consumer<CreateTableStatement> _function_1 = (CreateTableStatement statement) -> {
        this.generateActiveRecordEntity(it, resource, fsa, ((CreateTableStatement) statement));
      };
      _tables.forEach(_function_1);
      SqliteDatabaseSnapshot _snapshot_1 = it.getSnapshot();
      ArrayList<CreateViewStatement> _views = _snapshot_1.getViews();
      final Consumer<CreateViewStatement> _function_2 = (CreateViewStatement statement) -> {
        this.generateActiveRecordEntity(it, resource, fsa, ((CreateViewStatement) statement));
      };
      _views.forEach(_function_2);
      final Consumer<CreateTableStatement> _function_3 = (CreateTableStatement statement) -> {
        this.generateActiveRecordEntity(it, resource, fsa, ((CreateTableStatement) statement));
      };
      it.initTables.forEach(_function_3);
      final Consumer<CreateViewStatement> _function_4 = (CreateViewStatement statement) -> {
        this.generateActiveRecordEntity(it, resource, fsa, ((CreateViewStatement) statement));
      };
      it.initViews.forEach(_function_4);
      final Procedure2<MigrationBlock, Integer> _function_5 = (MigrationBlock item, Integer index) -> {
        String _packageName_3 = it.getPackageName();
        String _databaseName_3 = it.getDatabaseName();
        BigDecimal _version = item.getVersion();
        this.generateMigration(_packageName_3, _databaseName_3, resource, fsa, item, _version);
      };
      IterableExtensions.<MigrationBlock>forEach(it.migrations, _function_5);
    };
    _values.forEach(_function);
  }
  
  public void generateActiveRecordEntity(final MickeyDatabaseModel model, final Resource resource, final IFileSystemAccess fsa, final CreateTableStatement statement) {
    boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(statement);
    if (_hasAndroidPrimaryKey) {
      String _packageName = model.getPackageName();
      String _name = statement.getName();
      String _pascalize = Strings.pascalize(_name);
      String _concat = _pascalize.concat("Record");
      String genFileName = Strings.resolveFileName(_packageName, _concat);
      String _packageName_1 = model.getPackageName();
      String _databaseName = model.getDatabaseName();
      CharSequence _generate = this.mActiveRecordGenerator.generate(_packageName_1, _databaseName, statement);
      fsa.generateFile(genFileName, _generate);
    }
  }
  
  public void generateActiveRecordEntity(final MickeyDatabaseModel model, final Resource resource, final IFileSystemAccess fsa, final CreateViewStatement statement) {
    boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(statement);
    if (_hasAndroidPrimaryKey) {
      String _packageName = model.getPackageName();
      String _name = statement.getName();
      String _pascalize = Strings.pascalize(_name);
      String _concat = _pascalize.concat("Record");
      String genFileName = Strings.resolveFileName(_packageName, _concat);
      String _packageName_1 = model.getPackageName();
      String _databaseName = model.getDatabaseName();
      CharSequence _generate = this.mActiveRecordGenerator.generate(_packageName_1, _databaseName, statement);
      fsa.generateFile(genFileName, _generate);
    }
  }
  
  public void generateMigration(final String packageName, final String databaseName, final Resource resource, final IFileSystemAccess fsa, final MigrationBlock migration, final BigDecimal version) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Model model = ((Model) _head);
    String _concat = packageName.concat(".migrations");
    String _pascalize = Strings.pascalize(databaseName);
    String _concat_1 = "Default".concat(_pascalize);
    String _concat_2 = _concat_1.concat("MigrationV");
    String _valueOf = String.valueOf(version);
    String _concat_3 = _concat_2.concat(_valueOf);
    String genFileName = Strings.resolveFileName(_concat, _concat_3);
    SqliteMigrationGenerator generator = this.mMigrationGenerator.get();
    CharSequence _generate = generator.generate(model, packageName, databaseName, migration, version);
    fsa.generateFile(genFileName, _generate);
  }
}