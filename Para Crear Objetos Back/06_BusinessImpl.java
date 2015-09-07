
@Service
public class XXXXXXXBusinessImpl implements XXXXXXXBusiness {

	@Autowired
	@Resource(name = "YYYYYYYRepositoryImpl")
	XXXXXXXRepository YYYYYYYRepository;
	
	
	@Override
	public Collection<XXXXXXX> findAll() {

		return XXXXXXXAdapter.toCore(YYYYYYYRepository.findAll());
	}

	
	@Override
	public Collection<XXXXXXX> findRange(int ini, int fin) {

		return null;
	}
	
	
	@Override
	public XXXXXXX find(Integer id) {

		return XXXXXXXAdapter.toCore(YYYYYYYRepository.find(id));
	}
	
	
	@Override
	public Collection<XXXXXXX> findByName(String pName) {

		return XXXXXXXAdapter.toCore(YYYYYYYRepository.findByName(pName));
	}

	
	@Override
	public XXXXXXX save(XXXXXXX propiedad) {

		return XXXXXXXAdapter.toCore(YYYYYYYRepository.save(XXXXXXXAdapter.toPersistence(propiedad)));
	}

	
	@Override
	public void delete(XXXXXXX dpropiedad) {

		YYYYYYYRepository.delete(XXXXXXXAdapter.toPersistence(find(dpropiedad.getCodigo())));

		TransactionSynchronizationManager.getResourceMap();
	}

	
	@Override
	public Collection<XXXXXXX> filter(XXXXXXX YYYYYYY, Collection<FiltroEntity> filtros) {

		return null;
		//return XXXXXXXAdapter.toCore(YYYYYYYRepository.filter(XXXXXXXAdapter.toPersistence(YYYYYYY), filtros));
	}
}