#ifndef MOVEMENTARCHETYPE_H
#define MOVEMENTARCHETYPE_H

#include <string>

class MovementArchetype {
public:
    static const MovementArchetype HUGE;
    static const MovementArchetype LARGE;
    static const MovementArchetype MEDIUM;
    static const MovementArchetype SMALL;
    static const MovementArchetype TINY;

private:
    enum class MovementEnum;

    const MovementEnum enumId;
    const std::string name;
    const double minClimbAngle;
    const double maxClimbAngle;

    MovementArchetype(const MovementEnum & movementType, const std::string & movementName, const double & climbAngle);
};

#endif // MOVEMENTARCHETYPE_H
