package by.zakharenko.task04oop.repository.specification.quadrangle;

import by.zakharenko.task04oop.entity.Quadrangle;
import by.zakharenko.task04oop.entity.QuadrangleRegistrar;
import by.zakharenko.task04oop.repository.QuadrangleRegistrarRepository;
import by.zakharenko.task04oop.repository.specification.CompositeSpecification;

public class FindSpecificationByQuadrangleIsConvex extends CompositeSpecification<Quadrangle> {
    @Override
    public boolean isSatisfiedBy(Quadrangle candidate) {
        QuadrangleRegistrar registrar = QuadrangleRegistrarRepository.getInstance().get(candidate.getId());
        return registrar.isConvex();
    }
}
