#include "MovementArchetype.h"

enum class MovementArchetype::MovementEnum {
    HUGE, LARGE, MEDIUM, SMALL, TINY
};

MovementArchetype::MovementArchetype(const MovementEnum & movementType, const std::string & movementName, const double & climbAngle)
    :enumId(movementType), name(movementName), minClimbAngle(climbAngle), maxClimbAngle(40.0) {
}

const MovementArchetype MovementArchetype::HUGE(MovementArchetype::MovementEnum::HUGE, "Huge", 20.0);
const MovementArchetype MovementArchetype::LARGE(MovementArchetype::MovementEnum::LARGE, "Large", 25.0);
const MovementArchetype MovementArchetype::MEDIUM(MovementArchetype::MovementEnum::MEDIUM, "Medium", 30.0);
const MovementArchetype MovementArchetype::SMALL(MovementArchetype::MovementEnum::SMALL, "Small", 35.0);
const MovementArchetype MovementArchetype::TINY(MovementArchetype::MovementEnum::TINY, "Tiny", 40.0);
